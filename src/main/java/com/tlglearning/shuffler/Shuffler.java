package com.tlglearning.shuffler;

import java.util.Random;

public class Shuffler {                            //Class

  private final Random rng;                        //Field

  public Shuffler(Random rng) {                    //Constructor
    this.rng = rng;
  }
  public void shuffle(int[] data) {                //Method
    for (int i = data.length - 1; i >= 1; i--) {
      int t = rng.nextInt(i+1);                    //Uniformly distributed random generator
      if (t != i) {
        int temp = data[t];                        // Swap elements in an array....Step 1
        data[t] = data[i];                         // Swap....Step 2
        data[i] = temp;                            // Swap....Step 3

      }

    }
  }
}
