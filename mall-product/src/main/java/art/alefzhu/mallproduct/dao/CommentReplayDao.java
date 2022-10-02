package art.alefzhu.mallproduct.dao;

import art.alefzhu.mallproduct.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author alefzhu
 * @email alefzhu@outlook.com
 * @date 2022-10-01 19:15:28
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}
