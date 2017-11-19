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

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView mWeatherDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        mWeatherDisplay = (TextView) findViewById(R.id.tv_weather_data);
        String[] fakeWeatherData = {
                "Barcelona 21°C",
                "Madrid 30°C",
                "Paris 24°C",
                "Milan 17°C",
                "Kiev 15°C",
                "Amsterdam 30°C",
                "Lion 29°C",
                "Berlin 19°C"
        };
        for(String s: fakeWeatherData){
            mWeatherDisplay.append(s + "\n\n\n");
        }
    }
}