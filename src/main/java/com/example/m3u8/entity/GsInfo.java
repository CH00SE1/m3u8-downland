package com.example.m3u8.entity;

import com.alibaba.excel.annotation.write.style.*;
import com.alibaba.excel.enums.BooleanEnum;
import com.alibaba.excel.enums.poi.HorizontalAlignmentEnum;
import com.alibaba.excel.enums.poi.VerticalAlignmentEnum;
import com.alibaba.fastjson2.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.TableName;
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
@HeadStyle(locked = BooleanEnum.TRUE)
@HeadFontStyle(fontName = "等线", fontHeightInPoints = 14, bold = BooleanEnum.TRUE)
@ContentFontStyle(fontName = "微软雅黑", fontHeightInPoints = 12)
@HeadRowHeight(value = 25)
@ColumnWidth(value = 22)
@EqualsAndHashCode
@ContentStyle(horizontalAlignment = HorizontalAlignmentEnum.CENTER, verticalAlignment = VerticalAlignmentEnum.CENTER)
public class GsInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @JSONField(name = "end_date")
    private String endDate;

    private String flag;

    private String disease;

    @JSONField(name = "gz_flag")
    private String gzFlag;

    @JSONField(name = "indi_id")
    private String indiId;

    @JSONField(name = "fin_date")
    private String finDate;

    @JSONField(name = "biz_type")
    private String bizType;

    @JSONField(name = "begin_date")
    private String beginDate;

    @JSONField(name = "treat_type")
    private String treatType;

    private String xb;

    @JSONField(name = "corp_name")
    @ColumnWidth(value = 50)
    private String corpName;

    private String money;

    private String idcard;

    private String name;

    @JSONField(name = "insr_code")
    private String insrCode;

    @JSONField(name = "dz_flag")
    private String dzFlag;

    @JSONField(name = "serial_no")
    private String serialNo;

    @JSONField(name = "pers_type")
    private String persType;

}
