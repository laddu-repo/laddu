package hd;

import ie.j;
import java.util.List;
import kd.d0;
import kd.h0;
import kd.l;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends x4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6052a;

    public /* synthetic */ d(int i6) {
        this.f6052a = i6;
    }

    @Override // x4.c
    public final void a(g5.c statement, Object obj) {
        switch (this.f6052a) {
            case 0:
                l entity = (l) obj;
                k.e(statement, "statement");
                k.e(entity, "entity");
                statement.b(1, entity.f7876x);
                return;
            case 1:
                l entity2 = (l) obj;
                k.e(statement, "statement");
                k.e(entity2, "entity");
                long j = entity2.f7876x;
                statement.b(1, j);
                statement.v(2, entity2.f7877y);
                statement.v(3, entity2.f7878z);
                List list = entity2.A;
                k.e(list, "list");
                statement.v(4, j.L(list, "*", null, null, null, 62));
                statement.b(5, j);
                return;
            case 2:
                d0 entity3 = (d0) obj;
                k.e(statement, "statement");
                k.e(entity3, "entity");
                if (entity3.f7845a == null) {
                    statement.c(1);
                    return;
                } else {
                    statement.b(1, r12.intValue());
                    return;
                }
            default:
                h0 entity4 = (h0) obj;
                k.e(statement, "statement");
                k.e(entity4, "entity");
                if (entity4.H == null) {
                    statement.c(1);
                    return;
                } else {
                    statement.b(1, r12.intValue());
                    return;
                }
        }
    }

    @Override // x4.c
    public final String b() {
        switch (this.f6052a) {
            case 0:
                return "DELETE FROM `favorites` WHERE `id` = ?";
            case 1:
                return "UPDATE OR REPLACE `favorites` SET `id` = ?,`title` = ?,`image` = ?,`formats` = ? WHERE `id` = ?";
            case 2:
                return "DELETE FROM `playlists` WHERE `id` = ?";
            default:
                return "DELETE FROM `playlistFav` WHERE `id` = ?";
        }
    }

    public d(e eVar) {
        this.f6052a = 1;
    }
}
