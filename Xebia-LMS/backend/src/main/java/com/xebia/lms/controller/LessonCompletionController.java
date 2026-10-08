package com.xebia.Ims.controller;

import org.springframework.web.bind.annotation.*;
import com.xebia.Ims.service.LessonCompletionService;

@RestController
@RequestMapping("\lesson")
public class LessonCompletionController{

   private final LessonCompletionService;

   public LessonCompletionController(LessonCompletionService service){
    this.service=service;
   }

   @PostMapping("/complete")
   public void complete(@Requestparam String learnerId, @Requestparam String submoduledId){
    service.complete(learnerId,submoduleId);
   }

   @PostMapping("/undo")
   public void undo (RequestParam String learnerId, @RequestParam String submoduleId){
        service.undo(learnerId,submoduleId);
   }

}