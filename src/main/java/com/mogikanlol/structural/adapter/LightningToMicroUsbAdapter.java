package com.mogikanlol.structural.adapter;

public class LightningToMicroUsbAdapter implements MicroUsbPhone {

    private final LightningPhone lightningPhone;

    public LightningToMicroUsbAdapter(LightningPhone lightningPhone) {
        this.lightningPhone = lightningPhone;
    }

    @Override
    public void recharge() {
        lightningPhone.recharge();
    }

    @Override
    public void useMicroUsb() {
        lightningPhone.useLightning();
    }
}
