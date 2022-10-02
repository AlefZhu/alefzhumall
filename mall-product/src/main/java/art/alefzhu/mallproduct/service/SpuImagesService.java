package art.alefzhu.mallproduct.service;

import art.alefzhu.common.utils.PageUtils;
import art.alefzhu.mallproduct.entity.SpuImagesEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * spu图片
 *
 * @author alefzhu
 * @email alefzhu@outlook.com
 * @date 2022-10-01 19:15:28
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

