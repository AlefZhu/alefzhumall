package art.alefzhu.mallproduct.dao;

import art.alefzhu.mallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author alefzhu
 * @email alefzhu@outlook.com
 * @date 2022-10-01 19:15:28
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}
