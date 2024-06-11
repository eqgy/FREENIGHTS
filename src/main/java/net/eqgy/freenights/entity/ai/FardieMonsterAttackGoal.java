package net.eqgy.freenights.entity.ai;

import net.eqgy.freenights.entity.custom.FardieMonsterEntity;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;

public class FardieMonsterAttackGoal extends MeleeAttackGoal {

    private final FardieMonsterEntity entity;
    private int attackDelay = 27;
    private int ticksUntilNextAttack = 13;
    private boolean shouldCountTillNextAttack = false;

    public FardieMonsterAttackGoal(PathfinderMob pMob, double pSpeedModifier, boolean pFollowingTargetEvenIfNotSeen) {
        super(pMob, pSpeedModifier, pFollowingTargetEvenIfNotSeen);
        entity = (FardieMonsterEntity) pMob;
    }

    @Override
    protected void checkAndPerformAttack(LivingEntity pEnemy) {
        if (isEnemyWithinAttackDistance(pEnemy)) {
            shouldCountTillNextAttack = true;

            if(isTimeToStartAttackAnimation()) {
                entity.setAttacking(true);
            }

            if(isTimeToAttack()) {
                this.mob.getLookControl().setLookAt(pEnemy.getX(), pEnemy.getEyeY(), pEnemy.getZ());
                performAttack(pEnemy);
            }
        } else {
            resetAttackCooldown();
            shouldCountTillNextAttack = false;
            entity.setAttacking(false);
            entity.attackAnimationTimeout = 0;
        }
    }

    private boolean isEnemyWithinAttackDistance(LivingEntity pEnemy) {
        double attackReachSqr = 8*getAttackReachSqr(pEnemy);
        double distanceToEnemySqr = this.mob.distanceToSqr(pEnemy);
        return distanceToEnemySqr <= attackReachSqr;
    }


    protected void resetAttackCooldown() {
        this.ticksUntilNextAttack = this.adjustedTickDelay(attackDelay + 27);
    }

    protected boolean isTimeToAttack() {
        return this.ticksUntilNextAttack <= 0;
    }

    protected boolean isTimeToStartAttackAnimation() {
        return this.ticksUntilNextAttack <= attackDelay;
    }

    protected int getTicksUntilNextAttack() {
        return this.ticksUntilNextAttack;
    }

    @Override
    public boolean canUse() {
        LivingEntity target = this.mob.getTarget();
        return target != null && target.isAlive() && this.mob.distanceToSqr(target) <= 8.0; // Adjust 100.0 to your desired attack range


    }


    protected void performAttack(LivingEntity pEnemy) {
        this.resetAttackCooldown();
        // Trigger the attack animation here
        entity.setAttackAnimationState(true);
        this.mob.doHurtTarget(pEnemy);
    }


    @Override
    public void start() {
        super.start();
        attackDelay = 27;
        ticksUntilNextAttack = 13;
    }

    @Override
    public void tick() {
        super.tick();
        if (shouldCountTillNextAttack) {
            this.ticksUntilNextAttack = Math.max(this.ticksUntilNextAttack - 1, 0);
        }
    }

    @Override
    public void stop() {
        entity.setAttacking(false);
        super.stop();
    }

    private double getAttackReachSqr(LivingEntity entity) {
        return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
    }
}
