package com.jcirmodelsquad.tcjcir.extras.packets;

import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.ExperimentalGeometryCar;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;

public class UpdateGeometryCar implements IMessage {

    public int entity;
    public String railroadName;
    public String lineType;
    public String operatingCrew;

    public UpdateGeometryCar() {}

    public UpdateGeometryCar(int entity, String railroadName, String lineType, String operatingCrew) {
        this.entity = entity;
        this.railroadName = railroadName;
        this.lineType = lineType;
        this.operatingCrew = operatingCrew;
    }
    @Override
    public void fromBytes(ByteBuf buf) {
        this.entity = buf.readInt();
        railroadName = ByteBufUtils.readUTF8String(buf);
        lineType = ByteBufUtils.readUTF8String(buf);
        operatingCrew = ByteBufUtils.readUTF8String(buf);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(entity);
        ByteBufUtils.writeUTF8String(buf, railroadName);
        ByteBufUtils.writeUTF8String(buf, lineType);
        ByteBufUtils.writeUTF8String(buf, operatingCrew);
    }

    public static class Handler implements IMessageHandler<UpdateGeometryCar, IMessage> {
        @Override
        public IMessage onMessage(UpdateGeometryCar message, MessageContext ctx) {
            Entity theCar = ctx.getServerHandler().playerEntity.worldObj.getEntityByID(message.entity);
            if (theCar instanceof ExperimentalGeometryCar) {
                ExperimentalGeometryCar theGeoCar = (ExperimentalGeometryCar)theCar;
                theGeoCar.railroadLine = message.railroadName;
                theGeoCar.lineType = message.lineType;
                theGeoCar.operatingCrew = message.operatingCrew;
            }
            return null;
        }
    }

}
