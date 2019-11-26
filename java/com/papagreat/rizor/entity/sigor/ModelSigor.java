package com.papagreat.rizor.entity.sigor;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelSigor - Papagreat
 * Created using Tabula 7.0.0
 */
public class ModelSigor extends ModelBase {
    public ModelRenderer FrontLeftLeg;
    public ModelRenderer FrontRightLeg;
    public ModelRenderer BackRightLeg;
    public ModelRenderer BackLeftLeg;
    public ModelRenderer LowerBody;
    public ModelRenderer UpperBody;
    public ModelRenderer Head;

    public ModelSigor() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.BackLeftLeg = new ModelRenderer(this, 0, 0);
        this.BackLeftLeg.setRotationPoint(3.0F, 17.0F, 5.0F);
        this.BackLeftLeg.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.LowerBody = new ModelRenderer(this, 0, 0);
        this.LowerBody.setRotationPoint(-5.0F, 12.0F, -5.0F);
        this.LowerBody.addBox(0.0F, 0.0F, 0.0F, 10, 5, 12, 0.0F);
        this.FrontLeftLeg = new ModelRenderer(this, 0, 0);
        this.FrontLeftLeg.setRotationPoint(3.0F, 17.0F, -5.0F);
        this.FrontLeftLeg.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.BackRightLeg = new ModelRenderer(this, 0, 0);
        this.BackRightLeg.setRotationPoint(-5.0F, 17.0F, 5.0F);
        this.BackRightLeg.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(-3.9F, 2.0F, -2.2F);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 8, 5, 7, 0.0F);
        this.UpperBody = new ModelRenderer(this, 0, 0);
        this.UpperBody.setRotationPoint(-5.0F, 7.0F, -5.0F);
        this.UpperBody.addBox(0.0F, 0.0F, 0.0F, 10, 5, 12, 0.0F);
        this.FrontRightLeg = new ModelRenderer(this, 0, 0);
        this.FrontRightLeg.setRotationPoint(-5.0F, 17.0F, -5.0F);
        this.FrontRightLeg.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.BackLeftLeg.render(f5);
        this.LowerBody.render(f5);
        this.FrontLeftLeg.render(f5);
        this.BackRightLeg.render(f5);
        this.Head.render(f5);
        this.UpperBody.render(f5);
        this.FrontRightLeg.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) 
    {
    	this.BackLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + (float)Math.PI) * 1.4f * limbSwingAmount;
        this.BackRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + (float)Math.PI) * 1.4f * limbSwingAmount;
        this.FrontLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount; 
        this.FrontRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
    }
}
