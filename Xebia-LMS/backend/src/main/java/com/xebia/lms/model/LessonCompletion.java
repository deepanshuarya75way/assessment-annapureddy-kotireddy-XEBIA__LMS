package com.xebia.Ims.model;

import javaz.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="lesson_completions")
@Data
public class LessonCompletion{

  @Id
  private String id;

  private String learnerId;
  
  private String submoduleId;

  private boolean compleated;

}