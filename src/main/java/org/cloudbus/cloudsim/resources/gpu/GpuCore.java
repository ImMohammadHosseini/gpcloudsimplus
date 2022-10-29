package org.cloudbus.cloudsim.resources.gpu;

import org.cloudbus.cloudsim.core.ChangeableId;
import org.cloudbus.cloudsim.resources.ResourceManageable;
import org.cloudbus.cloudsim.provisioners.CoreProvisioner;

public interface GpuCore extends ChangeableId, ResourceManageable {
    
    enum Status {
        FREE,
        BUSY,
        FAILED
    }

    GpuCore NULL = new GpuCoreNull();

    @Override
    long getCapacity ();

    @Override
    boolean setCapacity (long mipsCapacity);

    boolean setCapacity (double mipsCapacity);

    GpuCore setCoreProvisioner(CoreProvisioner coreProvisioner);

    CoreProvisioner getCoreProvisioner();

    Status getStatus();

    boolean setStatus(Status status);

    boolean isWorking();

    boolean isFailed();

    boolean isFree();

    boolean isBusy();
}
