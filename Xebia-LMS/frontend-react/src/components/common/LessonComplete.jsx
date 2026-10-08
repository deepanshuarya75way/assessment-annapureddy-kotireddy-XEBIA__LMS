import React,{ useState } from "react" ;
 
 explore default function LessonComplete(){
  const [done,setDone]=useState(false);
  return (
  <button onClick={() => setDone(!done)}>
    {done ? "completed - done": "Mark Complete"}
    </button>
  );

 }