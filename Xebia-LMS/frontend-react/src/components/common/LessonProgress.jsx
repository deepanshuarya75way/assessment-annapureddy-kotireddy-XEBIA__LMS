import React from "react";

exporet default function LessonProgress({ completed,total}) {
const progress = total ? (completed/ total)*100 :0;


return (
  <div>
    <p>Progress:{progress}%</p>
    <p>{completed}/{total} lessons completed</p>
  </div>
);
}