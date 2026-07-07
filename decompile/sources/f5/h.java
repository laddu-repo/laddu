package f5;

import android.animation.TypeEvaluator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f5239a = new h();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f4 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float f10 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fG = j4.a.g(f10, f4, f, f4);
        float fG2 = j4.a.g(fPow4, fPow, f, fPow);
        float fG3 = j4.a.g(fPow5, fPow2, f, fPow2);
        float fG4 = j4.a.g(fPow6, fPow3, f, fPow3);
        float fPow7 = ((float) Math.pow(fG2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fG3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fG4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fG * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
