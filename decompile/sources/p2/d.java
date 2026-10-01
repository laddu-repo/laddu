package p2;

import android.util.Base64;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import s3.p;
import s3.r;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends com.unity3d.scar.adapter.common.f {

    /* renamed from: e, reason: collision with root package name */
    public boolean f10482e;

    /* renamed from: f, reason: collision with root package name */
    public UUID f10483f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f10484g;

    @Override // com.unity3d.scar.adapter.common.f
    public final Object e() {
        UUID uuid = this.f10483f;
        byte[] a10 = p.a(uuid, null, this.f10484g);
        byte[] bArr = this.f10484g;
        StringBuilder sb2 = new StringBuilder();
        for (int i6 = 0; i6 < bArr.length; i6 += 2) {
            sb2.append((char) bArr[i6]);
        }
        String sb3 = sb2.toString();
        byte[] decode = Base64.decode(sb3.substring(sb3.indexOf("<KID>") + 5, sb3.indexOf("</KID>")), 0);
        byte b10 = decode[0];
        decode[0] = decode[3];
        decode[3] = b10;
        byte b11 = decode[1];
        decode[1] = decode[2];
        decode[2] = b11;
        byte b12 = decode[4];
        decode[4] = decode[5];
        decode[5] = b12;
        byte b13 = decode[6];
        decode[6] = decode[7];
        decode[7] = b13;
        return new a(uuid, a10, new r[]{new r(true, null, 8, decode, 0, 0, null)});
    }

    @Override // com.unity3d.scar.adapter.common.f
    public final boolean g(String str) {
        return "ProtectionHeader".equals(str);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public final void i(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f10482e = false;
        }
    }

    @Override // com.unity3d.scar.adapter.common.f
    public final void m(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f10482e = true;
            String attributeValue = xmlPullParser.getAttributeValue(null, "SystemID");
            if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
            }
            this.f10483f = UUID.fromString(attributeValue);
        }
    }

    @Override // com.unity3d.scar.adapter.common.f
    public final void n(XmlPullParser xmlPullParser) {
        if (this.f10482e) {
            this.f10484g = Base64.decode(xmlPullParser.getText(), 0);
        }
    }
}
