package com.xebia.Ims.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.xebia.Ims.model.LessonCompletion;

public interface LessonCompletionRepo
        extends JpaRepository<LessonCompletion,String>{
       }