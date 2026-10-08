const mongoose = require("mongoose");

const LessonCompletionSchema = new mongoose.Schema({

  learnerId: String,
  lessonId: String,
  completed: Boolean
});
module.exports=mongoose.model("LessonCompletion",LessonCompletionSchema);