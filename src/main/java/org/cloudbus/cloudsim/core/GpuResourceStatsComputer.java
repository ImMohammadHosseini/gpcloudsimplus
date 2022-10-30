package org.cloudbus.cloudsim.core;

import org.cloudbus.cloudsim.resources.gpu.Gpu;
import org.cloudbus.cloudsim.vgpu.VGpu;
//import org.cloudbus.cloudsim.gp.videocards.Videocard;

public interface GpuResourceStatsComputer<T extends GResourceStats> {
	
	T getGpuUtilizationStats();

    void enableUtilizationStats();
}