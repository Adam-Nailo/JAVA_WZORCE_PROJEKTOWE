package org.wzorce_projektowe;

import lombok.*;

/**
 * Created by Adam Seweryn
 */

@Builder
@Data
public class House {
  private String adress;
  private int floorsNumber;
  private int doorsNumber;
  private int windowsNumber;
}
