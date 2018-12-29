package com.snm.persistence.po;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Data
public class BContent {

    private String id;

    private String titleCn;

    private String code;

    private String contentCode;

    private String providerId;

    private String onelevelId;

    private String correlateId;

    private Integer status;

    private Integer dispatchStatus;

    private Integer cdnStatus;

    private Integer operType;

    private String serviceCode;

    private Integer serviceType;

    private Integer seriesType;

    private Integer contentType;

    private String categoryId;

    private String categoryCode;

    private Date createdAt;

    private Date updatedAt;

    private String logoUrl;

    private Integer definitionFlag;

    private Integer rating;

    private Integer playTime;

    private String language;

    private String titleEn;

    private Integer orderSeq;

    private Integer volumnCount;

    private String actorPlay;

    private String writerPlay;

    private String originalCountry;

    private String releaseYear;

    private String orgairDate;

    private Date effectiveTime;

    private Date expireTime;

    private String kPeople;

    private String director;

    private String scriptWriter;

    private String compere;

    private String guest;

    private String reporter;

    private String opinCharge;

    private Integer payStatus;

    private String externalOther;

    private String externalProperty;

    private String cid;

    private String vid;

    private String viewPoint;

    private Integer contentTemplateId;

    private Integer roleId;

    private String bannerUrl;

    private String source;

}