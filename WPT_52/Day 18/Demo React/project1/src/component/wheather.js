import React, { useState, useEffect } from 'react';

function WeatherComponent() {
  const [weather, setWeather] = useState(null);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    // This effect runs once when the component mounts
    const fetchWeather = async () => {
      try {
        const response = await fetch(
          'https://api.open-meteo.com/v1/forecast?latitude=18.52&longitude=73.85&current_weather=true'
        );
        const data = await response.json();
        setWeather(data.current_weather);
      } catch (error) {
        console.error('Error fetching weather:', error);
      } finally {
        setLoading(false);
      }
    };

    fetchWeather();
  }, []); // Empty dependency array means this runs only once

  return (
    <div>
      <h2>🌤️ Current Weather in Pune</h2>
      {loading ? ( <p>Loading...</p> ) 
    : weather ? (
        <div>
          <p>Temperature: {weather.temperature}°C</p>
          <p>Wind Speed: {weather.windspeed} km/h</p>
        </div>) 
    : (<p>Could not fetch weather data.</p>
      )}
    </div>
  );
}

export default WeatherComponent;
