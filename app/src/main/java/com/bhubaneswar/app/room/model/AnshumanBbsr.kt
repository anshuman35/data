package com.bhubaneswar.app.room.model

import androidx.`annotation`.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlin.String

/**
 * PostgreSQL Compatible Database Schema Redirection
 */
@Entity(tableName = "anshumanbbsr")
public class AnshumanBbsr {
  @PrimaryKey
  @NonNull
  public var distance: String = 26
}
