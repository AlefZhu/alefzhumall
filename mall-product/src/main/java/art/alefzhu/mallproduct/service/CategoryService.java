package art.alefzhu.mallproduct.service;

import art.alefzhu.common.utils.PageUtils;
import art.alefzhu.mallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author alefzhu
 * @email alefzhu@outlook.com
 * @date 2022-10-01 19:15:28
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

