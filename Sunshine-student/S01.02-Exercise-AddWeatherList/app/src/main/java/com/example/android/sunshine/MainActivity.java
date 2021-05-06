/*
 * Copyright (C) 2016 The Android Open Source Project
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
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // done (1) Create a field to store the weather display TextView

    TextView weatherTextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);
        weatherTextview= (TextView) findViewById(R.id.tv_weather_data);

            String [] weather_data = {
                    "Thu, May 06  -11 / 3°C  - light rain",
                    "Fri, May 07  -14 / 3°C  - light rain",
                 "Sat, May 08  -18 / 5°C  - moderate rain",
                 "Sun, May 09  -20 / 11°C - broken clouds",
                    "Mon, May 10  -16 / 10°C - light rain",
                   " Tue, May 11  -16 / 8°C  - overcast clouds",
                   "Wed, May 12  -15 / 7°C  - light rain",
                    "Thu, May 13  -13 / 8°C  - light rain",};
            for(String data : weather_data){
                weatherTextview.append(data +"\n\n\n");
            }


        // done (2) Use findViewById to get a reference to the weather display TextView

        // done (3) Create an array of Strings that contain fake weather data

        // done (4) Append each String from the fake weather data array to the TextView
    }
}