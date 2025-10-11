import React, { useState } from 'react';

// Simple ErrorBoundary class component
class ErrorBoundary extends React.Component {
  constructor(props) {
    super(props);
    this.state = { hasError: false };
  }

  static getDerivedStateFromError(error) {
    return { hasError: true };
  }

  componentDidCatch(error, errorInfo) {
    console.error("Error caught by ErrorBoundary:", error, errorInfo);
  }

  render() {
    if (this.state.hasError) {
      return <h2>Something went wrong.</h2>;
    }
    return this.props.children;
  }
}

// Counter1 component
const Counter1 = ({ value, onClick }) => {
  if (value === 5) {
    throw new Error('Counter1 crashed at 5!');
  }
  return (
    <div>
      <h3>Counter 1: {value}</h3>
      <button onClick={onClick}>Increment Counter 1</button>
    </div>
  );
};

// Counter2 component
const Counter2 = ({ value, onClick }) => {
  return (
    <div>
      <h3>Counter 2: {value}</h3>
      <button onClick={onClick}>Increment Counter 2</button>
    </div>
  );
};

// Main Counter component
const Counter = () => {
  const [count1, setCounter1] = useState(1);
  const [count2, setCounter2] = useState(10);

  const increment1 = () => setCounter1(count1 + 1);
  const increment2 = () => setCounter2(count2 + 1);

  return (
    <>
      <ErrorBoundary>
        <Counter1 value={count1} onClick={increment1} />
      </ErrorBoundary>

      <Counter2 value={count2} onClick={increment2} />
    </>
  );
};

export default Counter;