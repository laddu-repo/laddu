package com.unity3d.ads.core.data.datasource;

import kotlin.jvm.internal.f;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class VolumeSettingsChange {

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class MuteChange extends VolumeSettingsChange {
        private final boolean isMuted;

        public MuteChange(boolean z10) {
            super(null);
            this.isMuted = z10;
        }

        public static /* synthetic */ MuteChange copy$default(MuteChange muteChange, boolean z10, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                z10 = muteChange.isMuted;
            }
            return muteChange.copy(z10);
        }

        public final boolean component1() {
            return this.isMuted;
        }

        public final MuteChange copy(boolean z10) {
            return new MuteChange(z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof MuteChange) && this.isMuted == ((MuteChange) obj).isMuted) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            boolean z10 = this.isMuted;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public final boolean isMuted() {
            return this.isMuted;
        }

        public String toString() {
            return "MuteChange(isMuted=" + this.isMuted + ')';
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class VolumeChange extends VolumeSettingsChange {
        private final double volume;

        public VolumeChange(double d10) {
            super(null);
            this.volume = d10;
        }

        public static /* synthetic */ VolumeChange copy$default(VolumeChange volumeChange, double d10, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                d10 = volumeChange.volume;
            }
            return volumeChange.copy(d10);
        }

        public final double component1() {
            return this.volume;
        }

        public final VolumeChange copy(double d10) {
            return new VolumeChange(d10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof VolumeChange) && Double.compare(this.volume, ((VolumeChange) obj).volume) == 0) {
                return true;
            }
            return false;
        }

        public final double getVolume() {
            return this.volume;
        }

        public int hashCode() {
            long doubleToLongBits = Double.doubleToLongBits(this.volume);
            return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        }

        public String toString() {
            return "VolumeChange(volume=" + this.volume + ')';
        }
    }

    public /* synthetic */ VolumeSettingsChange(f fVar) {
        this();
    }

    private VolumeSettingsChange() {
    }
}
