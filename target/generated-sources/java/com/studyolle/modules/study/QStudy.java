package com.studyolle.modules.study;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStudy is a Querydsl query type for Study
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStudy extends EntityPathBase<Study> {

    private static final long serialVersionUID = -330079583L;

    public static final QStudy study = new QStudy("study");

    public final BooleanPath closed = createBoolean("closed");

    public final DateTimePath<java.time.LocalDateTime> closedDateTime = createDateTime("closedDateTime", java.time.LocalDateTime.class);

    public final StringPath fullDescription = createString("fullDescription");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath image = createString("image");

    public final SetPath<com.studyolle.modules.account.Account, com.studyolle.modules.account.QAccount> managers = this.<com.studyolle.modules.account.Account, com.studyolle.modules.account.QAccount>createSet("managers", com.studyolle.modules.account.Account.class, com.studyolle.modules.account.QAccount.class, PathInits.DIRECT2);

    public final NumberPath<Integer> memberCount = createNumber("memberCount", Integer.class);

    public final SetPath<com.studyolle.modules.account.Account, com.studyolle.modules.account.QAccount> members = this.<com.studyolle.modules.account.Account, com.studyolle.modules.account.QAccount>createSet("members", com.studyolle.modules.account.Account.class, com.studyolle.modules.account.QAccount.class, PathInits.DIRECT2);

    public final StringPath path = createString("path");

    public final BooleanPath published = createBoolean("published");

    public final DateTimePath<java.time.LocalDateTime> publishedDateTime = createDateTime("publishedDateTime", java.time.LocalDateTime.class);

    public final BooleanPath recruiting = createBoolean("recruiting");

    public final DateTimePath<java.time.LocalDateTime> recruitingUpdatedDateTime = createDateTime("recruitingUpdatedDateTime", java.time.LocalDateTime.class);

    public final StringPath shortDescription = createString("shortDescription");

    public final SetPath<com.studyolle.modules.tag.Tag, com.studyolle.modules.tag.QTag> tags = this.<com.studyolle.modules.tag.Tag, com.studyolle.modules.tag.QTag>createSet("tags", com.studyolle.modules.tag.Tag.class, com.studyolle.modules.tag.QTag.class, PathInits.DIRECT2);

    public final StringPath title = createString("title");

    public final BooleanPath useBanner = createBoolean("useBanner");

    public final SetPath<com.studyolle.modules.zone.Zone, com.studyolle.modules.zone.QZone> zones = this.<com.studyolle.modules.zone.Zone, com.studyolle.modules.zone.QZone>createSet("zones", com.studyolle.modules.zone.Zone.class, com.studyolle.modules.zone.QZone.class, PathInits.DIRECT2);

    public QStudy(String variable) {
        super(Study.class, forVariable(variable));
    }

    public QStudy(Path<? extends Study> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStudy(PathMetadata metadata) {
        super(Study.class, metadata);
    }

}

