'use client'

import { useEffect, useState } from "react";

export default function Home() {
  const [data, setData] = useState(null);

  useEffect(() => {
    fetch('http://localhost:8080/api/data').then((response) => {
      if (!response.ok){
        throw new Error('Network Error');
      }
      return response.json();
    }).then((data) => setData(data)).catch((error) => {
      console.error('Problem occured with the fetch operation from backend API', error);
    });
  }, []);

  return (
    <div>
      <h1>Welcome to AviaAid</h1>
      <div>Backend API:{data ? JSON.stringify(data) : <p>Loading...</p>}</div>
    </div>
  );
}
