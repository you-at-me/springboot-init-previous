package cn.example.init.pre.service.impl;

import cn.example.init.pre.common.ErrorCode;
import cn.example.init.pre.exception.BusinessException;
import cn.example.init.pre.mapper.InterfaceInfoMapper;
import cn.example.init.pre.model.entity.InterfaceInfo;
import cn.example.init.pre.service.InterfaceInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author zyshu
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2023-05-13 20:57:53
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService {

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean b) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();
        if (b) {
            if (StringUtils.isAnyBlank(name)) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
        }
        if(StringUtils.isNotBlank(name) && name.length() < 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "名称过长");
        }
    }
}




