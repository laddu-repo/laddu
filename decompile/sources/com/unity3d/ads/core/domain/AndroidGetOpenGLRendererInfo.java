package com.unity3d.ads.core.domain;

import android.opengl.GLES20;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gl.EglCore;
import com.unity3d.ads.gl.OffscreenSurface;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidGetOpenGLRendererInfo implements GetOpenGLRendererInfo {
    private final SessionRepository sessionRepository;

    public AndroidGetOpenGLRendererInfo(SessionRepository sessionRepository) {
        k.e(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetOpenGLRendererInfo
    public ByteString invoke() {
        if (this.sessionRepository.getFeatureFlags().getOpenglGpuEnabled()) {
            EglCore eglCore = new EglCore(null, 2);
            OffscreenSurface offscreenSurface = new OffscreenSurface(eglCore, 1, 1);
            offscreenSurface.makeCurrent();
            String renderer = GLES20.glGetString(7937);
            k.d(renderer, "renderer");
            byte[] bytes = renderer.getBytes(df.a.f4115a);
            k.d(bytes, "this as java.lang.String).getBytes(charset)");
            ByteString copyFrom = ByteString.copyFrom(bytes);
            offscreenSurface.release();
            eglCore.release();
            k.d(copyFrom, "{\n            // We need…dererByteString\n        }");
            return copyFrom;
        }
        ByteString empty = ByteString.empty();
        k.d(empty, "{\n            ByteString.empty()\n        }");
        return empty;
    }
}
