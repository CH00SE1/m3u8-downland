package com.example.m3u8.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * root
 * </p>
 *
 * @author xiongshao
 * @since 2022-07-05
 */
@TableName("t_open")
@ApiModel(value = "Open对象", description = "root")
public class Open implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("36284113")
    private String setlId;

    @ApiModelProperty("56741021")
    private String mdtrtId;

    @ApiModelProperty("陈雪英")
    private String psnName;

    @ApiModelProperty("01")
    private String psnCertType;

    @ApiModelProperty("居民身份证（户口簿）")
    private String psnCertTypeName;

    @ApiModelProperty("430121193310307923")
    private String certno;

    @ApiModelProperty("43000020100030375675")
    private String psnNo;

    @ApiModelProperty("2")
    private String gend;

    @ApiModelProperty("女")
    private String gendName;

    @ApiModelProperty("01")
    private String naty;

    @ApiModelProperty("汉族")
    private String natyName;

    @ApiModelProperty("390")
    private String insutype;

    @ApiModelProperty("城乡居民基本医疗保险")
    private String insutypeName;

    @ApiModelProperty("16")
    private String psnType;

    @ApiModelProperty("居民(老)")
    private String psnTypeName;

    @ApiModelProperty("2022-01-01")
    private String begndate;

    @ApiModelProperty("2022-01-01")
    private String enddate;

    @ApiModelProperty("2022-01-01 08:09:49")
    private String setlTime;

    @ApiModelProperty("576.07")
    private Double medfeeSumamt;

    @ApiModelProperty("576.07")
    private Double hiAgreSumfee;

    @ApiModelProperty("210")
    private Long fundPaySumamt;

    @ApiModelProperty("366.07")
    private Double psnPay;

    @ApiModelProperty("0")
    private Long acctPay;

    @ApiModelProperty("366.07")
    private Double cashPayamt;

    @ApiModelProperty("0")
    private Long fulamtOwnpayAmt;

    @ApiModelProperty("0")
    private Long preselfpayAmt;

    @ApiModelProperty("576.07")
    private Double inscpAmt;

    @ApiModelProperty("0")
    private Long dedcStd;

    @ApiModelProperty("0")
    private Long crtDedc;

    @ApiModelProperty("0")
    private Long actPayDedc;

    @ApiModelProperty("210")
    private Long hifpPay;

    @ApiModelProperty("0.7")
    private Double poolPropSelfpay;

    @ApiModelProperty("0")
    private Long cvlservPay;

    @ApiModelProperty("0")
    private Long hifesPay;

    @ApiModelProperty("0")
    private Long hifmiPay;

    @ApiModelProperty("0")
    private Long hifobPay;

    @ApiModelProperty("0")
    private Long hifdmPay;

    @ApiModelProperty("0")
    private Long mafPay;

    @ApiModelProperty("0")
    private Long othfundPay;

    @ApiModelProperty("0")
    private String cvlservFlag;

    @ApiModelProperty("否")
    private String cvlservFlagName;

    @ApiModelProperty("null")
    private String cvlservLv;

    @ApiModelProperty("null")
    private String cvlservLvName;

    @ApiModelProperty("null")
    private String spPsnType;

    @ApiModelProperty("null")
    private String spPsnTypeName;

    @ApiModelProperty("null")
    private String spPsnTypeLv;

    @ApiModelProperty("null")
    private String spPsnTypeLvName;

    @ApiModelProperty("null")
    private String clctGrde;

    @ApiModelProperty("null")
    private String clctGrdeName;

    @ApiModelProperty("0")
    private String flxempeFlag;

    @ApiModelProperty("否")
    private String flxempeFlagName;

    @ApiModelProperty("null")
    private String nwbFlag;

    @ApiModelProperty("null")
    private String nwbFlagName;

    @ApiModelProperty("430105")
    private String insuAdmdvs;

    @ApiModelProperty("开福区")
    private String insuAdmdvsName;

    @ApiModelProperty("430105040300")
    private String empNo;

    @ApiModelProperty("迎宾路社区")
    private String empName;

    @ApiModelProperty("01")
    private String empType;

    @ApiModelProperty("01")
    private String empTypeName;

    @ApiModelProperty("null")
    private String empMgtType;

    @ApiModelProperty("null")
    private String empMgtTypeName;

    @ApiModelProperty("2")
    private String payLoc;

    @ApiModelProperty("医疗机构")
    private String payLocName;

    @ApiModelProperty("P43010201038")
    private String fixmedinsCode;

    @ApiModelProperty("湖南达嘉维康医药产业股份有限公司五一路分店")
    private String fixmedinsName;

    @ApiModelProperty("0")
    private String hospLv;

    @ApiModelProperty("0")
    private String hospLvName;

    @ApiModelProperty("02")
    private String mdtrtCertType;

    @ApiModelProperty("居民身份证")
    private String mdtrtCertTypeName;

    @ApiModelProperty("14")
    private String medType;

    @ApiModelProperty("门诊慢特病")
    private String medTypeName;

    @ApiModelProperty("2")
    private String setlType;

    @ApiModelProperty("联网结算")
    private String setlTypeName;

    @ApiModelProperty("11")
    private String clrType;

    @ApiModelProperty("门诊")
    private String clrTypeName;

    @ApiModelProperty("1")
    private String clrWay;

    @ApiModelProperty("按项目")
    private String clrWayName;

    @ApiModelProperty("430199")
    private String clrOptins;

    @ApiModelProperty("长沙市市本级")
    private String clrOptinsName;

    @ApiModelProperty("0")
    private String refdSetlFlag;

    @ApiModelProperty("否")
    private String refdSetlFlagName;

    @ApiModelProperty("430121193310307923")
    private String mdtrtCertNo;

    @ApiModelProperty("M01603")
    private String diseNo;

    @ApiModelProperty("糖尿病并发症")
    private String diseName;

    public String getSetlId() {
        return setlId;
    }

    public void setSetlId(String setlId) {
        this.setlId = setlId;
    }
    public String getMdtrtId() {
        return mdtrtId;
    }

    public void setMdtrtId(String mdtrtId) {
        this.mdtrtId = mdtrtId;
    }
    public String getPsnName() {
        return psnName;
    }

    public void setPsnName(String psnName) {
        this.psnName = psnName;
    }
    public String getPsnCertType() {
        return psnCertType;
    }

    public void setPsnCertType(String psnCertType) {
        this.psnCertType = psnCertType;
    }
    public String getPsnCertTypeName() {
        return psnCertTypeName;
    }

    public void setPsnCertTypeName(String psnCertTypeName) {
        this.psnCertTypeName = psnCertTypeName;
    }
    public String getCertno() {
        return certno;
    }

    public void setCertno(String certno) {
        this.certno = certno;
    }
    public String getPsnNo() {
        return psnNo;
    }

    public void setPsnNo(String psnNo) {
        this.psnNo = psnNo;
    }
    public String getGend() {
        return gend;
    }

    public void setGend(String gend) {
        this.gend = gend;
    }
    public String getGendName() {
        return gendName;
    }

    public void setGendName(String gendName) {
        this.gendName = gendName;
    }
    public String getNaty() {
        return naty;
    }

    public void setNaty(String naty) {
        this.naty = naty;
    }
    public String getNatyName() {
        return natyName;
    }

    public void setNatyName(String natyName) {
        this.natyName = natyName;
    }
    public String getInsutype() {
        return insutype;
    }

    public void setInsutype(String insutype) {
        this.insutype = insutype;
    }
    public String getInsutypeName() {
        return insutypeName;
    }

    public void setInsutypeName(String insutypeName) {
        this.insutypeName = insutypeName;
    }
    public String getPsnType() {
        return psnType;
    }

    public void setPsnType(String psnType) {
        this.psnType = psnType;
    }
    public String getPsnTypeName() {
        return psnTypeName;
    }

    public void setPsnTypeName(String psnTypeName) {
        this.psnTypeName = psnTypeName;
    }
    public String getBegndate() {
        return begndate;
    }

    public void setBegndate(String begndate) {
        this.begndate = begndate;
    }
    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }
    public String getSetlTime() {
        return setlTime;
    }

    public void setSetlTime(String setlTime) {
        this.setlTime = setlTime;
    }
    public Double getMedfeeSumamt() {
        return medfeeSumamt;
    }

    public void setMedfeeSumamt(Double medfeeSumamt) {
        this.medfeeSumamt = medfeeSumamt;
    }
    public Double getHiAgreSumfee() {
        return hiAgreSumfee;
    }

    public void setHiAgreSumfee(Double hiAgreSumfee) {
        this.hiAgreSumfee = hiAgreSumfee;
    }
    public Long getFundPaySumamt() {
        return fundPaySumamt;
    }

    public void setFundPaySumamt(Long fundPaySumamt) {
        this.fundPaySumamt = fundPaySumamt;
    }
    public Double getPsnPay() {
        return psnPay;
    }

    public void setPsnPay(Double psnPay) {
        this.psnPay = psnPay;
    }
    public Long getAcctPay() {
        return acctPay;
    }

    public void setAcctPay(Long acctPay) {
        this.acctPay = acctPay;
    }
    public Double getCashPayamt() {
        return cashPayamt;
    }

    public void setCashPayamt(Double cashPayamt) {
        this.cashPayamt = cashPayamt;
    }
    public Long getFulamtOwnpayAmt() {
        return fulamtOwnpayAmt;
    }

    public void setFulamtOwnpayAmt(Long fulamtOwnpayAmt) {
        this.fulamtOwnpayAmt = fulamtOwnpayAmt;
    }
    public Long getPreselfpayAmt() {
        return preselfpayAmt;
    }

    public void setPreselfpayAmt(Long preselfpayAmt) {
        this.preselfpayAmt = preselfpayAmt;
    }
    public Double getInscpAmt() {
        return inscpAmt;
    }

    public void setInscpAmt(Double inscpAmt) {
        this.inscpAmt = inscpAmt;
    }
    public Long getDedcStd() {
        return dedcStd;
    }

    public void setDedcStd(Long dedcStd) {
        this.dedcStd = dedcStd;
    }
    public Long getCrtDedc() {
        return crtDedc;
    }

    public void setCrtDedc(Long crtDedc) {
        this.crtDedc = crtDedc;
    }
    public Long getActPayDedc() {
        return actPayDedc;
    }

    public void setActPayDedc(Long actPayDedc) {
        this.actPayDedc = actPayDedc;
    }
    public Long getHifpPay() {
        return hifpPay;
    }

    public void setHifpPay(Long hifpPay) {
        this.hifpPay = hifpPay;
    }
    public Double getPoolPropSelfpay() {
        return poolPropSelfpay;
    }

    public void setPoolPropSelfpay(Double poolPropSelfpay) {
        this.poolPropSelfpay = poolPropSelfpay;
    }
    public Long getCvlservPay() {
        return cvlservPay;
    }

    public void setCvlservPay(Long cvlservPay) {
        this.cvlservPay = cvlservPay;
    }
    public Long getHifesPay() {
        return hifesPay;
    }

    public void setHifesPay(Long hifesPay) {
        this.hifesPay = hifesPay;
    }
    public Long getHifmiPay() {
        return hifmiPay;
    }

    public void setHifmiPay(Long hifmiPay) {
        this.hifmiPay = hifmiPay;
    }
    public Long getHifobPay() {
        return hifobPay;
    }

    public void setHifobPay(Long hifobPay) {
        this.hifobPay = hifobPay;
    }
    public Long getHifdmPay() {
        return hifdmPay;
    }

    public void setHifdmPay(Long hifdmPay) {
        this.hifdmPay = hifdmPay;
    }
    public Long getMafPay() {
        return mafPay;
    }

    public void setMafPay(Long mafPay) {
        this.mafPay = mafPay;
    }
    public Long getOthfundPay() {
        return othfundPay;
    }

    public void setOthfundPay(Long othfundPay) {
        this.othfundPay = othfundPay;
    }
    public String getCvlservFlag() {
        return cvlservFlag;
    }

    public void setCvlservFlag(String cvlservFlag) {
        this.cvlservFlag = cvlservFlag;
    }
    public String getCvlservFlagName() {
        return cvlservFlagName;
    }

    public void setCvlservFlagName(String cvlservFlagName) {
        this.cvlservFlagName = cvlservFlagName;
    }
    public String getCvlservLv() {
        return cvlservLv;
    }

    public void setCvlservLv(String cvlservLv) {
        this.cvlservLv = cvlservLv;
    }
    public String getCvlservLvName() {
        return cvlservLvName;
    }

    public void setCvlservLvName(String cvlservLvName) {
        this.cvlservLvName = cvlservLvName;
    }
    public String getSpPsnType() {
        return spPsnType;
    }

    public void setSpPsnType(String spPsnType) {
        this.spPsnType = spPsnType;
    }
    public String getSpPsnTypeName() {
        return spPsnTypeName;
    }

    public void setSpPsnTypeName(String spPsnTypeName) {
        this.spPsnTypeName = spPsnTypeName;
    }
    public String getSpPsnTypeLv() {
        return spPsnTypeLv;
    }

    public void setSpPsnTypeLv(String spPsnTypeLv) {
        this.spPsnTypeLv = spPsnTypeLv;
    }
    public String getSpPsnTypeLvName() {
        return spPsnTypeLvName;
    }

    public void setSpPsnTypeLvName(String spPsnTypeLvName) {
        this.spPsnTypeLvName = spPsnTypeLvName;
    }
    public String getClctGrde() {
        return clctGrde;
    }

    public void setClctGrde(String clctGrde) {
        this.clctGrde = clctGrde;
    }
    public String getClctGrdeName() {
        return clctGrdeName;
    }

    public void setClctGrdeName(String clctGrdeName) {
        this.clctGrdeName = clctGrdeName;
    }
    public String getFlxempeFlag() {
        return flxempeFlag;
    }

    public void setFlxempeFlag(String flxempeFlag) {
        this.flxempeFlag = flxempeFlag;
    }
    public String getFlxempeFlagName() {
        return flxempeFlagName;
    }

    public void setFlxempeFlagName(String flxempeFlagName) {
        this.flxempeFlagName = flxempeFlagName;
    }
    public String getNwbFlag() {
        return nwbFlag;
    }

    public void setNwbFlag(String nwbFlag) {
        this.nwbFlag = nwbFlag;
    }
    public String getNwbFlagName() {
        return nwbFlagName;
    }

    public void setNwbFlagName(String nwbFlagName) {
        this.nwbFlagName = nwbFlagName;
    }
    public String getInsuAdmdvs() {
        return insuAdmdvs;
    }

    public void setInsuAdmdvs(String insuAdmdvs) {
        this.insuAdmdvs = insuAdmdvs;
    }
    public String getInsuAdmdvsName() {
        return insuAdmdvsName;
    }

    public void setInsuAdmdvsName(String insuAdmdvsName) {
        this.insuAdmdvsName = insuAdmdvsName;
    }
    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }
    public String getEmpTypeName() {
        return empTypeName;
    }

    public void setEmpTypeName(String empTypeName) {
        this.empTypeName = empTypeName;
    }
    public String getEmpMgtType() {
        return empMgtType;
    }

    public void setEmpMgtType(String empMgtType) {
        this.empMgtType = empMgtType;
    }
    public String getEmpMgtTypeName() {
        return empMgtTypeName;
    }

    public void setEmpMgtTypeName(String empMgtTypeName) {
        this.empMgtTypeName = empMgtTypeName;
    }
    public String getPayLoc() {
        return payLoc;
    }

    public void setPayLoc(String payLoc) {
        this.payLoc = payLoc;
    }
    public String getPayLocName() {
        return payLocName;
    }

    public void setPayLocName(String payLocName) {
        this.payLocName = payLocName;
    }
    public String getFixmedinsCode() {
        return fixmedinsCode;
    }

    public void setFixmedinsCode(String fixmedinsCode) {
        this.fixmedinsCode = fixmedinsCode;
    }
    public String getFixmedinsName() {
        return fixmedinsName;
    }

    public void setFixmedinsName(String fixmedinsName) {
        this.fixmedinsName = fixmedinsName;
    }
    public String getHospLv() {
        return hospLv;
    }

    public void setHospLv(String hospLv) {
        this.hospLv = hospLv;
    }
    public String getHospLvName() {
        return hospLvName;
    }

    public void setHospLvName(String hospLvName) {
        this.hospLvName = hospLvName;
    }
    public String getMdtrtCertType() {
        return mdtrtCertType;
    }

    public void setMdtrtCertType(String mdtrtCertType) {
        this.mdtrtCertType = mdtrtCertType;
    }
    public String getMdtrtCertTypeName() {
        return mdtrtCertTypeName;
    }

    public void setMdtrtCertTypeName(String mdtrtCertTypeName) {
        this.mdtrtCertTypeName = mdtrtCertTypeName;
    }
    public String getMedType() {
        return medType;
    }

    public void setMedType(String medType) {
        this.medType = medType;
    }
    public String getMedTypeName() {
        return medTypeName;
    }

    public void setMedTypeName(String medTypeName) {
        this.medTypeName = medTypeName;
    }
    public String getSetlType() {
        return setlType;
    }

    public void setSetlType(String setlType) {
        this.setlType = setlType;
    }
    public String getSetlTypeName() {
        return setlTypeName;
    }

    public void setSetlTypeName(String setlTypeName) {
        this.setlTypeName = setlTypeName;
    }
    public String getClrType() {
        return clrType;
    }

    public void setClrType(String clrType) {
        this.clrType = clrType;
    }
    public String getClrTypeName() {
        return clrTypeName;
    }

    public void setClrTypeName(String clrTypeName) {
        this.clrTypeName = clrTypeName;
    }
    public String getClrWay() {
        return clrWay;
    }

    public void setClrWay(String clrWay) {
        this.clrWay = clrWay;
    }
    public String getClrWayName() {
        return clrWayName;
    }

    public void setClrWayName(String clrWayName) {
        this.clrWayName = clrWayName;
    }
    public String getClrOptins() {
        return clrOptins;
    }

    public void setClrOptins(String clrOptins) {
        this.clrOptins = clrOptins;
    }
    public String getClrOptinsName() {
        return clrOptinsName;
    }

    public void setClrOptinsName(String clrOptinsName) {
        this.clrOptinsName = clrOptinsName;
    }
    public String getRefdSetlFlag() {
        return refdSetlFlag;
    }

    public void setRefdSetlFlag(String refdSetlFlag) {
        this.refdSetlFlag = refdSetlFlag;
    }
    public String getRefdSetlFlagName() {
        return refdSetlFlagName;
    }

    public void setRefdSetlFlagName(String refdSetlFlagName) {
        this.refdSetlFlagName = refdSetlFlagName;
    }
    public String getMdtrtCertNo() {
        return mdtrtCertNo;
    }

    public void setMdtrtCertNo(String mdtrtCertNo) {
        this.mdtrtCertNo = mdtrtCertNo;
    }
    public String getDiseNo() {
        return diseNo;
    }

    public void setDiseNo(String diseNo) {
        this.diseNo = diseNo;
    }
    public String getDiseName() {
        return diseName;
    }

    public void setDiseName(String diseName) {
        this.diseName = diseName;
    }

    @Override
    public String toString() {
        return "Open{" +
            "setlId=" + setlId +
            ", mdtrtId=" + mdtrtId +
            ", psnName=" + psnName +
            ", psnCertType=" + psnCertType +
            ", psnCertTypeName=" + psnCertTypeName +
            ", certno=" + certno +
            ", psnNo=" + psnNo +
            ", gend=" + gend +
            ", gendName=" + gendName +
            ", naty=" + naty +
            ", natyName=" + natyName +
            ", insutype=" + insutype +
            ", insutypeName=" + insutypeName +
            ", psnType=" + psnType +
            ", psnTypeName=" + psnTypeName +
            ", begndate=" + begndate +
            ", enddate=" + enddate +
            ", setlTime=" + setlTime +
            ", medfeeSumamt=" + medfeeSumamt +
            ", hiAgreSumfee=" + hiAgreSumfee +
            ", fundPaySumamt=" + fundPaySumamt +
            ", psnPay=" + psnPay +
            ", acctPay=" + acctPay +
            ", cashPayamt=" + cashPayamt +
            ", fulamtOwnpayAmt=" + fulamtOwnpayAmt +
            ", preselfpayAmt=" + preselfpayAmt +
            ", inscpAmt=" + inscpAmt +
            ", dedcStd=" + dedcStd +
            ", crtDedc=" + crtDedc +
            ", actPayDedc=" + actPayDedc +
            ", hifpPay=" + hifpPay +
            ", poolPropSelfpay=" + poolPropSelfpay +
            ", cvlservPay=" + cvlservPay +
            ", hifesPay=" + hifesPay +
            ", hifmiPay=" + hifmiPay +
            ", hifobPay=" + hifobPay +
            ", hifdmPay=" + hifdmPay +
            ", mafPay=" + mafPay +
            ", othfundPay=" + othfundPay +
            ", cvlservFlag=" + cvlservFlag +
            ", cvlservFlagName=" + cvlservFlagName +
            ", cvlservLv=" + cvlservLv +
            ", cvlservLvName=" + cvlservLvName +
            ", spPsnType=" + spPsnType +
            ", spPsnTypeName=" + spPsnTypeName +
            ", spPsnTypeLv=" + spPsnTypeLv +
            ", spPsnTypeLvName=" + spPsnTypeLvName +
            ", clctGrde=" + clctGrde +
            ", clctGrdeName=" + clctGrdeName +
            ", flxempeFlag=" + flxempeFlag +
            ", flxempeFlagName=" + flxempeFlagName +
            ", nwbFlag=" + nwbFlag +
            ", nwbFlagName=" + nwbFlagName +
            ", insuAdmdvs=" + insuAdmdvs +
            ", insuAdmdvsName=" + insuAdmdvsName +
            ", empNo=" + empNo +
            ", empName=" + empName +
            ", empType=" + empType +
            ", empTypeName=" + empTypeName +
            ", empMgtType=" + empMgtType +
            ", empMgtTypeName=" + empMgtTypeName +
            ", payLoc=" + payLoc +
            ", payLocName=" + payLocName +
            ", fixmedinsCode=" + fixmedinsCode +
            ", fixmedinsName=" + fixmedinsName +
            ", hospLv=" + hospLv +
            ", hospLvName=" + hospLvName +
            ", mdtrtCertType=" + mdtrtCertType +
            ", mdtrtCertTypeName=" + mdtrtCertTypeName +
            ", medType=" + medType +
            ", medTypeName=" + medTypeName +
            ", setlType=" + setlType +
            ", setlTypeName=" + setlTypeName +
            ", clrType=" + clrType +
            ", clrTypeName=" + clrTypeName +
            ", clrWay=" + clrWay +
            ", clrWayName=" + clrWayName +
            ", clrOptins=" + clrOptins +
            ", clrOptinsName=" + clrOptinsName +
            ", refdSetlFlag=" + refdSetlFlag +
            ", refdSetlFlagName=" + refdSetlFlagName +
            ", mdtrtCertNo=" + mdtrtCertNo +
            ", diseNo=" + diseNo +
            ", diseName=" + diseName +
        "}";
    }
}
