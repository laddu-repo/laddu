package hd;

import ie.j;
import java.util.List;
import kd.d0;
import kd.h0;
import kd.l;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends x4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6051a;

    public /* synthetic */ c(int i6) {
        this.f6051a = i6;
    }

    @Override // x4.c
    public final void a(g5.c statement, Object obj) {
        switch (this.f6051a) {
            case 0:
                l entity = (l) obj;
                k.e(statement, "statement");
                k.e(entity, "entity");
                statement.b(1, entity.f7876x);
                statement.v(2, entity.f7877y);
                statement.v(3, entity.f7878z);
                List list = entity.A;
                k.e(list, "list");
                statement.v(4, j.L(list, "*", null, null, null, 62));
                return;
            case 1:
                d0 entity2 = (d0) obj;
                k.e(statement, "statement");
                k.e(entity2, "entity");
                if (entity2.f7845a == null) {
                    statement.c(1);
                } else {
                    statement.b(1, r0.intValue());
                }
                statement.v(2, entity2.f7846b);
                statement.v(3, entity2.f7847c);
                return;
            default:
                h0 entity3 = (h0) obj;
                k.e(statement, "statement");
                k.e(entity3, "entity");
                String str = entity3.f7857x;
                if (str == null) {
                    statement.c(1);
                } else {
                    statement.v(1, str);
                }
                String str2 = entity3.f7858y;
                if (str2 == null) {
                    statement.c(2);
                } else {
                    statement.v(2, str2);
                }
                String str3 = entity3.f7859z;
                if (str3 == null) {
                    statement.c(3);
                } else {
                    statement.v(3, str3);
                }
                statement.v(4, entity3.A);
                String str4 = entity3.B;
                if (str4 == null) {
                    statement.c(5);
                } else {
                    statement.v(5, str4);
                }
                String str5 = entity3.C;
                if (str5 == null) {
                    statement.c(6);
                } else {
                    statement.v(6, str5);
                }
                String str6 = entity3.D;
                if (str6 == null) {
                    statement.c(7);
                } else {
                    statement.v(7, str6);
                }
                String str7 = entity3.E;
                if (str7 == null) {
                    statement.c(8);
                } else {
                    statement.v(8, str7);
                }
                String str8 = entity3.F;
                if (str8 == null) {
                    statement.c(9);
                } else {
                    statement.v(9, str8);
                }
                String str9 = entity3.G;
                if (str9 == null) {
                    statement.c(10);
                } else {
                    statement.v(10, str9);
                }
                if (entity3.H == null) {
                    statement.c(11);
                    return;
                } else {
                    statement.b(11, r10.intValue());
                    return;
                }
        }
    }

    @Override // x4.c
    public final String b() {
        switch (this.f6051a) {
            case 0:
                return "INSERT OR REPLACE INTO `favorites` (`id`,`title`,`image`,`formats`) VALUES (?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `playlists` (`id`,`title`,`path`) VALUES (?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `playlistFav` (`name`,`groupTitle`,`logo`,`link`,`userAgent`,`referrer`,`origin`,`cookie`,`drmLicense`,`drmScheme`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public c(e eVar) {
        this.f6051a = 0;
    }
}
