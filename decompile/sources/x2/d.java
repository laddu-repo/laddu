package x2;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f14460a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f14461b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final float[] f14462c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    public final float[] f14463d = new float[3];

    /* renamed from: e, reason: collision with root package name */
    public final Display f14464e;

    /* renamed from: f, reason: collision with root package name */
    public final c[] f14465f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14466g;

    public d(Display display, c... cVarArr) {
        this.f14464e = display;
        this.f14465f = cVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i6;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f14460a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f14464e.getRotation();
        float[] fArr3 = this.f14461b;
        if (rotation != 0) {
            int i10 = 129;
            if (rotation != 1) {
                i6 = 130;
                if (rotation != 2) {
                    if (rotation == 3) {
                        i10 = 130;
                        i6 = 1;
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } else {
                i10 = 2;
                i6 = 129;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i10, i6, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f14463d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f3 = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        boolean z10 = this.f14466g;
        float[] fArr5 = this.f14462c;
        if (!z10) {
            a2.c.b(fArr5, fArr2);
            this.f14466g = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        for (int i11 = 0; i11 < 2; i11++) {
            this.f14465f[i11].a(fArr2, f3);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i6) {
    }
}
