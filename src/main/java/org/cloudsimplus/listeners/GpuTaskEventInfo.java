package org.cloudsimplus.listeners;

import org.cloudsimplus.listeners.EventInfo;
import org.cloudbus.cloudsim.cloudlets.gputasks.GpuTask;

public interface GpuTaskEventInfo extends EventInfo {

    GpuTask getGpuTask();
}

