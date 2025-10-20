package com.bertugkuturoglu.services.impl;

import com.bertugkuturoglu.dto.DtoHome;
import com.bertugkuturoglu.dto.DtoRoom;
import com.bertugkuturoglu.entities.Home;
import com.bertugkuturoglu.entities.Room;
import com.bertugkuturoglu.repository.HomeRepository;
import com.bertugkuturoglu.services.IHomeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HomeServiceImpl  implements IHomeService {

    @Autowired
   private HomeRepository homeRepository;

    @Override
    public DtoHome findHomeById(Long id) {
        DtoHome dtoHome = new DtoHome();

        Optional<Home> optional = homeRepository.findById(id);
        if (optional.isEmpty()){
            return null;
        }
        Home dbHome = optional.get();
        List<Room> dbRooms = optional.get().getRoom();

        BeanUtils.copyProperties(dbHome, dtoHome);

        if (dbRooms != null && !dbRooms.isEmpty()) {
            for (Room room : dbRooms) {
                DtoRoom  dtoRoom = new DtoRoom();
                BeanUtils.copyProperties(room ,dtoRoom);
                dtoHome.getRoom().add(dtoRoom);
            }
        }
        return dtoHome;
    }
}
