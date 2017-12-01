package uk.ac.belfastmet.dwarf.service;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.ac.belfastmet.dwarf.domain.Dwarf;
import uk.ac.belfastmet.dwarf.respository.DwarfRepository;

@Service
public class DataLoader
{
	@Autowired
	private DwarfRepository dwarfRepository;
		
	public DataLoader(DwarfRepository dwarfRepository)
	{
		super();
		this.dwarfRepository = dwarfRepository;
	}

	@PostConstruct
	public void loadData()
	{
	Dwarf happy = new Dwarf("Happy", "Disney", "Happy.png");
	dwarfRepository.save(happy);
	Dwarf sleepy = new Dwarf("Sleepy", "Disney", "Sleepy.png");
	dwarfRepository.save(sleepy);
	Dwarf dopey = new Dwarf("Dopey", "Disney", "Dopey.png");
	dwarfRepository.save(dopey);
	Dwarf bashful = new Dwarf("Bashful", "Disney", "Bashful.png");
	dwarfRepository.save(bashful);
	Dwarf sneezy = new Dwarf("Sneezy", "Disney", "Sneezy.png");
	dwarfRepository.save(sneezy);
	Dwarf doc = new Dwarf("Doc", "Disney", "Doc.png");
	dwarfRepository.save(doc);
	Dwarf grumpy = new Dwarf("Grumpy", "Disney", "Grumpy.png");
	dwarfRepository.save(grumpy);
	Dwarf thorin = new Dwarf("Thorin", "Tolkien", "Thorin.png");
	dwarfRepository.save(thorin);
	Dwarf balin = new Dwarf("Balin", "Tolkien", "Balin.png");
	dwarfRepository.save(balin);
	Dwarf dwalin = new Dwarf("Dwalin", "Tolkien", "Dwalin.png");
	dwarfRepository.save(dwalin);
	Dwarf fili = new Dwarf("Fili", "Tolkien", "Fili.png");
	dwarfRepository.save(fili);
	Dwarf kili = new Dwarf("Kili", "Tolkien", "Kili.png");
	dwarfRepository.save(kili);
	Dwarf dori = new Dwarf("Dori", "Tolkien", "Dori.png");
	dwarfRepository.save(dori);
	Dwarf nori = new Dwarf("Nori", "Tolkien", "Nori.png");
	dwarfRepository.save(nori);
	Dwarf oin = new Dwarf("Oin", "Tolkien", "Oin.png");
	dwarfRepository.save(oin);
	Dwarf ori = new Dwarf("Ori", "Tolkien", "Ori.png");
	dwarfRepository.save(ori);
	Dwarf gloin = new Dwarf("Gloin", "Tolkien", "Gloin.png");
	dwarfRepository.save(gloin);
	Dwarf bifur = new Dwarf("Bifur", "Tolkien", "Bifur.png");
	dwarfRepository.save(bifur);
	Dwarf bofur = new Dwarf("Bofur", "Tolkien", "Bofur.png");
	dwarfRepository.save(bofur);
	Dwarf bombur = new Dwarf("Bombur", "Tolkien", "Bombur.png");
	dwarfRepository.save(bombur);
	}
}//Class DataLoader End
