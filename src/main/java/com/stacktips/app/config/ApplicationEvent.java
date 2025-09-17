package com.stacktips.app.config;

import org.springframework.batch.core.JobExecutionException;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;

@Component
@RequiredArgsConstructor
public class ApplicationEvent {
    private final JobLauncher jobLauncher;
    private final Job csvImporterJob;

    @EventListener(ApplicationReadyEvent.class)
    public void applicationEvent() throws JobExecutionException {
        jobLauncher.run(csvImporterJob, new JobParameters());
    }
}
