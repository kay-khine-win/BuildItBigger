package com.udacity.gradle.builditbigger;

import android.util.Log;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertNotNull;


public class EndpointsAsyncTaskTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void testDoInBackground() throws Exception {

            EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(new EndpointsAsyncTask.TaskCompleteListener(){
                @Override
                public void onTaskComplete(String result) {
                }
            });

            endpointsAsyncTask.execute();
            String result = endpointsAsyncTask.get(30, TimeUnit.SECONDS);
            assertNotNull(result);

    }
}

