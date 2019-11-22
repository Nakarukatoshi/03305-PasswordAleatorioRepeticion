/* 
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
        //Constantes
        final int CHARAT_MIN = 0;
        final int CHARAT_MAX = 25;
        final int NUM_CARACTERES = 8;
        final String LETTERS = "QWERTYUIOPASDFGHJKLZXCVBNM";

        //Variables
        int passCharAt;
        String pass = "";

        //Bucle
        for (int i = 0; i < NUM_CARACTERES; i++) {
            passCharAt
                    = RND.nextInt(CHARAT_MAX - CHARAT_MIN + 1) + CHARAT_MIN;

            pass = pass + LETTERS.charAt(passCharAt);
        }

        //Salida
        System.out.printf("Password ...: %s%n", pass);
    }
}
