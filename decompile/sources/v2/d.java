package v2;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f13088a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f13089b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f13090c = new float[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f13091d = new float[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Display f13092e;
    public final c[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13093g;

    public d(Display display, c... cVarArr) {
        this.f13092e = display;
        this.f = cVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f13088a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f13092e.getRotation();
        float[] fArr3 = this.f13089b;
        if (rotation != 0) {
            int i10 = 129;
            if (rotation != 1) {
                i = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i10 = 130;
                    i = 1;
                }
            } else {
                i = 129;
                i10 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i10, i, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f13091d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z2 = this.f13093g;
        float[] fArr5 = this.f13090c;
        if (!z2) {
            c2.b.g(fArr5, fArr2);
            this.f13093g = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        for (int i11 = 0; i11 < 2; i11++) {
            this.f[i11].a(fArr2, f);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
