package com.xebia.Ims.service;

import org.springframework.stereotype.Service;
import com.xebia.Ims.model.LessonCompletion;
import com.xebia.Ims.repo.LessonCompletionrepo;

@Service

public class LessonCompletionService {
  private final LessonCompletionRepo repo;
   public LessonCompletionService(LessonCompletionRepo repo){
    this,repo=repo;
   }

   public void compleate( String l,String s){
   LessonCompletion c=new LessonCompletion();
   c.setId(l+ "_"+s);
   c.setLearnerId(l);
   c.setSubmoduleId(s);
   c.setCompleted(true);
   repo.save(c);
   }
   public void undo (String l, String s){
    LessonCompletion c= repo.findByLearnerIdAndSubmoduleId(l,s);
    if(c != null){
      c.setCompleted(false);
      repo.save(c);
    }
   }
}