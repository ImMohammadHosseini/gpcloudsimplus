package org.cloudbus.cloudsim.vgpu;

import org.cloudbus.cloudsim.core.GResourceStats;
import org.cloudbus.cloudsim.vgpu.VGpu;

import java.util.function.Function;

public class VGpuResourceStats extends GResourceStats<VGpu> {
    public static final VGpuResourceStats NULL = new VGpuResourceStats 
    		(VGpu.NULL, vgpu -> 0.0) { 
    	@Override public boolean add(double time) { return false; }};

    		
    public VGpuResourceStats(final VGpu machine, 
    		final Function<VGpu, Double> resourceUtilizationFunction) {
        super(machine, resourceUtilizationFunction);
    }
}
