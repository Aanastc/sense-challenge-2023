import { Body, Injectable, NotFoundException } from '@nestjs/common';
import { InjectRepository } from '@nestjs/typeorm';
import { CountryEntity } from 'src/models/domain/country.entity';
import { CreateCountryDto } from 'src/models/dto/create.country.dto';
import { GetPasswordDto } from 'src/models/dto/get.password';
import { CountrySchema } from 'src/schemas/country.schema';
import { Repository } from 'typeorm';


@Injectable()
export class CountryService {
  constructor(
    @InjectRepository(CountryEntity) private model: Repository<CountryEntity>) {}

  async findAll(): Promise<CountryEntity[]> {
    //implementar aqui :)

    return null;
  }

  async getCountryPasswords(countryId: string): Promise<GetPasswordDto> {
   //implementar aqui :)

   return null;
  }
}
