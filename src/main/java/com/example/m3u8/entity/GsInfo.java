package com.example.m3u8.entity;

import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentFontStyle;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import com.baomidou.mybatisplus.annotation.TableName;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author xiongshao
 * @since 2022-08-02
 */
@TableName("t_gs_info")
@ApiModel(value = "GsInfo对象", description = "")
@Getter
@Setter
@ContentFontStyle(fontName = "微软雅黑", fontHeightInPoints = 10)
@HeadRowHeight(20)
@ColumnWidth(22)
@EqualsAndHashCode
public class GsInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @SerializedName("end_date")
    private String endDate;

    private String flag;

    private String disease;

    @SerializedName("gz_flag")
    private String gzFlag;

    @SerializedName("indi_id")
    private String indiId;

    @SerializedName("fin_date")
    private String finDate;

    @SerializedName("biz_type")
    private String bizType;

    @SerializedName("begin_date")
    private String beginDate;

    @SerializedName("treat_type")
    private String treatType;

    private String xb;

    @SerializedName("corp_name")
    @ColumnWidth(value = 50)
    private String corpName;

    private String money;

    private String idcard;

    private String name;

    @SerializedName("insr_code")
    private String insrCode;

    @SerializedName("dz_flag")
    private String dzFlag;

    @SerializedName("serial_no")
    private String serialNo;

    @SerializedName("pers_type")
    private String persType;

}
