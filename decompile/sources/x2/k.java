package x2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;
import w2.v;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k extends GLSurfaceView {
    public static final /* synthetic */ int I = 0;
    public final d A;
    public final Handler B;
    public final i C;
    public SurfaceTexture D;
    public Surface E;
    public boolean F;
    public boolean G;
    public boolean H;

    /* renamed from: x, reason: collision with root package name */
    public final CopyOnWriteArrayList f14489x;

    /* renamed from: y, reason: collision with root package name */
    public final SensorManager f14490y;

    /* renamed from: z, reason: collision with root package name */
    public final Sensor f14491z;

    public k(Context context) {
        super(context, null);
        this.f14489x = new CopyOnWriteArrayList();
        this.B = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f14490y = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f14491z = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.C = iVar;
        j jVar = new j(this, iVar);
        View.OnTouchListener lVar = new l(context, jVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.A = new d(windowManager.getDefaultDisplay(), lVar, jVar);
        this.F = true;
        setEGLContextClientVersion(2);
        setRenderer(jVar);
        setOnTouchListener(lVar);
    }

    public final void a() {
        boolean z10;
        if (this.F && this.G) {
            z10 = true;
        } else {
            z10 = false;
        }
        Sensor sensor = this.f14491z;
        if (sensor != null && z10 != this.H) {
            d dVar = this.A;
            SensorManager sensorManager = this.f14490y;
            if (z10) {
                sensorManager.registerListener(dVar, sensor, 0);
            } else {
                sensorManager.unregisterListener(dVar);
            }
            this.H = z10;
        }
    }

    public a getCameraMotionListener() {
        return this.C;
    }

    public v getVideoFrameMetadataListener() {
        return this.C;
    }

    public Surface getVideoSurface() {
        return this.E;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B.post(new j2.h(this, 16));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.G = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.G = true;
        a();
    }

    public void setDefaultStereoMode(int i6) {
        this.C.H = i6;
    }

    public void setUseSensorRotation(boolean z10) {
        this.F = z10;
        a();
    }
}
