package pojo;

import java.io.Serializable;
import java.util.List;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author 560寝室
 * @since 2020-12-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class JobInfo implements Serializable {
    private static final long serialVersionUID = 1L;


    @TableId(type = IdType.ASSIGN_UUID)
    private String jobId;

    private String companyId;

    @TableField(exist = false)
    private CompanyInfo companyInfo;

    private String jobName;

    private String jobType;

    private String jobDescription;

    @TableField(exist = false)
    private List<DeliverRecordInfo> deliverRecordInfos;

}
