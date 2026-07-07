package androidx.media;

import h8.c;
import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f1004a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f1005b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f1006c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f1007d = -1;

    public final boolean equals(Object obj) {
        int i6;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f1005b == audioAttributesImplBase.f1005b) {
            int i10 = this.f1006c;
            int i11 = audioAttributesImplBase.f1006c;
            int i12 = audioAttributesImplBase.f1007d;
            if (i12 != -1) {
                i6 = i12;
            } else {
                int i13 = audioAttributesImplBase.f1004a;
                int i14 = AudioAttributesCompat.f1000b;
                if ((i11 & 1) == 1) {
                    i6 = 7;
                } else {
                    i6 = 4;
                    if ((i11 & 4) == 4) {
                        i6 = 6;
                    } else {
                        switch (i13) {
                            case 2:
                                i6 = 0;
                                break;
                            case 3:
                                i6 = 8;
                                break;
                            case 4:
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i6 = 5;
                                break;
                            case 6:
                                i6 = 2;
                                break;
                            case 11:
                                i6 = 10;
                                break;
                            case 12:
                            default:
                                i6 = 3;
                                break;
                            case 13:
                                i6 = 1;
                                break;
                        }
                    }
                }
            }
            if (i6 == 6) {
                i11 |= 4;
            } else if (i6 == 7) {
                i11 |= 1;
            }
            if (i10 == (i11 & 273) && this.f1004a == audioAttributesImplBase.f1004a && this.f1007d == i12) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1005b), Integer.valueOf(this.f1006c), Integer.valueOf(this.f1004a), Integer.valueOf(this.f1007d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f1007d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f1007d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i6 = this.f1004a;
        int i10 = AudioAttributesCompat.f1000b;
        switch (i6) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = c.i(i6, "unknown usage ");
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(str);
        sb2.append(" content=");
        sb2.append(this.f1005b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f1006c).toUpperCase());
        return sb2.toString();
    }
}
