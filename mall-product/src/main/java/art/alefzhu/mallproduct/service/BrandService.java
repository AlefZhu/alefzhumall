package art.alefzhu.mallproduct.service;

import art.alefzhu.common.utils.PageUtils;
import art.alefzhu.mallproduct.entity.BrandEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 品牌
 *
 * @author alefzhu
 * @email alefzhu@outlook.com
 * @date 2022-10-01 19:15:28
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

