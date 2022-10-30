package org.cloudsimplus.listeners;

import org.cloudsimplus.listeners.EventInfo;
import org.cloudbus.cloudsim.vgpu.VGpu;

public interface VGpuEventInfo extends EventInfo {

    VGpu getVGpu();
}
