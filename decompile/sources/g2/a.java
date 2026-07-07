package g2;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import w1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements w1.h {
    public CipherInputStream A;

    /* renamed from: x, reason: collision with root package name */
    public final w1.h f5301x;

    /* renamed from: y, reason: collision with root package name */
    public final byte[] f5302y;

    /* renamed from: z, reason: collision with root package name */
    public final byte[] f5303z;

    public a(w1.h hVar, byte[] bArr, byte[] bArr2) {
        this.f5301x = hVar;
        this.f5302y = bArr;
        this.f5303z = bArr2;
    }

    @Override // w1.h
    public final void close() {
        if (this.A != null) {
            this.A = null;
            this.f5301x.close();
        }
    }

    @Override // w1.h
    public final void q(a0 a0Var) {
        a0Var.getClass();
        this.f5301x.q(a0Var);
    }

    @Override // r1.i
    public final int read(byte[] bArr, int i6, int i10) {
        this.A.getClass();
        int read = this.A.read(bArr, i6, i10);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    @Override // w1.h
    public final Map u() {
        return this.f5301x.u();
    }

    @Override // w1.h
    public final long y(w1.l lVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f5302y, "AES"), new IvParameterSpec(this.f5303z));
                w1.k kVar = new w1.k(this.f5301x, lVar);
                this.A = new CipherInputStream(kVar, cipher);
                if (!kVar.A) {
                    kVar.f13539x.y(kVar.f13540y);
                    kVar.A = true;
                    return -1L;
                }
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // w1.h
    public final Uri z() {
        return this.f5301x.z();
    }
}
