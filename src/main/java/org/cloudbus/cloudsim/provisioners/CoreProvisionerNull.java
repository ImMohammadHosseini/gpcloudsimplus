package org.cloudbus.cloudsim.provisioners;

import org.cloudbus.cloudsim.resources.gpu.GpuCore;
import org.cloudbus.cloudsim.vgpu.VGpu;

final class CoreProvisionerNull extends GpuResourceProvisionerNull implements CoreProvisioner {
    @Override public void setCore (GpuCore core) {/**/}
    @Override public double getUtilization () {
        return 0;
    }
    @Override public boolean allocateResourceForVGpu (VGpu vgpu, double newTotalVGpuResource) {
        return false;
    }
}
