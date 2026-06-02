package com.bzz.miniapis.sdk.gamescomics;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "miniapis.enabled", havingValue = "true")
@EnableConfigurationProperties({
        AutochessVngProperties.class,
        BarterVgProperties.class,
        BoardGameGeekProperties.class,
        AmiiboapiProperties.class,
        ChessComProperties.class,
        GeekJokesProperties.class,
        BrawlStarsProperties.class,
        GraphqlPokemonProperties.class,
        DigimonTcgProperties.class,
        AnimalCrossingNewHorizonsProperties.class,
        Gw2SpidyProperties.class,
        DestinyTheGameProperties.class,
        DisneyProperties.class,
        FortniteProperties.class,
        ComicVineProperties.class,
        HyruleCompendiumProperties.class,
        ClashOfClansProperties.class,
        GamerpowerProperties.class,
        ClashRoyaleProperties.class,
        HearthstoneProperties.class,
        HypixelProperties.class,
        FuntranslationsProperties.class,
        HumbleBundleProperties.class,
        GenshinImpactProperties.class,
        GdbrowserProperties.class,
        FreetogameProperties.class,
        Dota2Properties.class,
        IgdbComProperties.class,
        HumorProperties.class,
        FfxivCollectProperties.class,
        ChuckNorrisDatabaseProperties.class,
        DungeonsAndDragonsAlternateProperties.class,
        ModIoProperties.class,
        PokApiGraphqlProperties.class,
        DigimonInformationProperties.class,
        PuyoNexusProperties.class,
        GiantBombProperties.class,
        PathOfExileProperties.class,
        SakuraCardcaptorProperties.class,
        PlayerdbProperties.class,
        GuildWars2Properties.class,
        MinecraftServerStatusProperties.class,
        LichessProperties.class,
        RawgIoProperties.class,
        HaloProperties.class,
        RaiderProperties.class,
        EveOnlineProperties.class,
        FunFactsProperties.class,
        MonsterHunterWorldProperties.class,
        SteamProperties.class,
        JokeapiProperties.class,
        PsychonautsProperties.class,
        WhenIsNextMcuFilmProperties.class,
        PokApiProperties.class,
        ScryfallProperties.class,
        MarioKartTourProperties.class,
        MmoGamesProperties.class,
        Steam2Properties.class,
        DeckOfCardsProperties.class,
        RunescapeProperties.class,
        FinalFantasyXivProperties.class,
        JokesOneProperties.class,
        BattleNetProperties.class,
        ValorantNonOfficialProperties.class,
        Rps101Properties.class,
        RickAndMortyProperties.class,
        QuizapiIoProperties.class,
        TetrIoProperties.class,
        OpenTriviaProperties.class,
        MarvelProperties.class,
        HytaleProperties.class,
        PubgProperties.class,
        DungeonsAndDragonsProperties.class,
        TronaldDumpProperties.class,
        RiotGamesProperties.class,
        MagicTheGatheringProperties.class,
        TebexProperties.class,
        CrossUniverseProperties.class,
        TcgdexProperties.class,
        PokMonTcgProperties.class,
        SuperheroesProperties.class,
        CheapsharkProperties.class,
        XkcdProperties.class,
        PandascoreProperties.class,
        SpacetradersapiProperties.class,
        WarfaceNonOfficialProperties.class,
        YuGiOhProperties.class,
        WargamingNetProperties.class,
        UniversalisProperties.class
})
public class GamesComicsAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.autochessvng.enabled", havingValue = "true", matchIfMissing = true)
    public AutochessVngClient autochessvngClient(AutochessVngProperties properties) {
        return new AutochessVngClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.bartervg.enabled", havingValue = "true", matchIfMissing = true)
    public BarterVgClient bartervgClient(BarterVgProperties properties) {
        return new BarterVgClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.boardgamegeek.enabled", havingValue = "true", matchIfMissing = true)
    public BoardGameGeekClient boardgamegeekClient(BoardGameGeekProperties properties) {
        return new BoardGameGeekClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.amiiboapi.enabled", havingValue = "true", matchIfMissing = true)
    public AmiiboapiClient amiiboapiClient(AmiiboapiProperties properties) {
        return new AmiiboapiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.chesscom.enabled", havingValue = "true", matchIfMissing = true)
    public ChessComClient chesscomClient(ChessComProperties properties) {
        return new ChessComClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.geekjokes.enabled", havingValue = "true", matchIfMissing = true)
    public GeekJokesClient geekjokesClient(GeekJokesProperties properties) {
        return new GeekJokesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.brawlstars.enabled", havingValue = "true", matchIfMissing = true)
    public BrawlStarsClient brawlstarsClient(BrawlStarsProperties properties) {
        return new BrawlStarsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.graphqlpokemon.enabled", havingValue = "true", matchIfMissing = true)
    public GraphqlPokemonClient graphqlpokemonClient(GraphqlPokemonProperties properties) {
        return new GraphqlPokemonClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.digimontcg.enabled", havingValue = "true", matchIfMissing = true)
    public DigimonTcgClient digimontcgClient(DigimonTcgProperties properties) {
        return new DigimonTcgClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.animalcrossingnewhorizons.enabled", havingValue = "true", matchIfMissing = true)
    public AnimalCrossingNewHorizonsClient animalcrossingnewhorizonsClient(AnimalCrossingNewHorizonsProperties properties) {
        return new AnimalCrossingNewHorizonsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.gw2spidy.enabled", havingValue = "true", matchIfMissing = true)
    public Gw2SpidyClient gw2spidyClient(Gw2SpidyProperties properties) {
        return new Gw2SpidyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.destinythegame.enabled", havingValue = "true", matchIfMissing = true)
    public DestinyTheGameClient destinythegameClient(DestinyTheGameProperties properties) {
        return new DestinyTheGameClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.disney.enabled", havingValue = "true", matchIfMissing = true)
    public DisneyClient disneyClient(DisneyProperties properties) {
        return new DisneyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.fortnite.enabled", havingValue = "true", matchIfMissing = true)
    public FortniteClient fortniteClient(FortniteProperties properties) {
        return new FortniteClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.comicvine.enabled", havingValue = "true", matchIfMissing = true)
    public ComicVineClient comicvineClient(ComicVineProperties properties) {
        return new ComicVineClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.hyrulecompendium.enabled", havingValue = "true", matchIfMissing = true)
    public HyruleCompendiumClient hyrulecompendiumClient(HyruleCompendiumProperties properties) {
        return new HyruleCompendiumClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.clashofclans.enabled", havingValue = "true", matchIfMissing = true)
    public ClashOfClansClient clashofclansClient(ClashOfClansProperties properties) {
        return new ClashOfClansClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.gamerpower.enabled", havingValue = "true", matchIfMissing = true)
    public GamerpowerClient gamerpowerClient(GamerpowerProperties properties) {
        return new GamerpowerClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.clashroyale.enabled", havingValue = "true", matchIfMissing = true)
    public ClashRoyaleClient clashroyaleClient(ClashRoyaleProperties properties) {
        return new ClashRoyaleClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.hearthstone.enabled", havingValue = "true", matchIfMissing = true)
    public HearthstoneClient hearthstoneClient(HearthstoneProperties properties) {
        return new HearthstoneClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.hypixel.enabled", havingValue = "true", matchIfMissing = true)
    public HypixelClient hypixelClient(HypixelProperties properties) {
        return new HypixelClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.funtranslations.enabled", havingValue = "true", matchIfMissing = true)
    public FuntranslationsClient funtranslationsClient(FuntranslationsProperties properties) {
        return new FuntranslationsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.humblebundle.enabled", havingValue = "true", matchIfMissing = true)
    public HumbleBundleClient humblebundleClient(HumbleBundleProperties properties) {
        return new HumbleBundleClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.genshinimpact.enabled", havingValue = "true", matchIfMissing = true)
    public GenshinImpactClient genshinimpactClient(GenshinImpactProperties properties) {
        return new GenshinImpactClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.gdbrowser.enabled", havingValue = "true", matchIfMissing = true)
    public GdbrowserClient gdbrowserClient(GdbrowserProperties properties) {
        return new GdbrowserClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.freetogame.enabled", havingValue = "true", matchIfMissing = true)
    public FreetogameClient freetogameClient(FreetogameProperties properties) {
        return new FreetogameClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.dota2.enabled", havingValue = "true", matchIfMissing = true)
    public Dota2Client dota2Client(Dota2Properties properties) {
        return new Dota2Client(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.igdbcom.enabled", havingValue = "true", matchIfMissing = true)
    public IgdbComClient igdbcomClient(IgdbComProperties properties) {
        return new IgdbComClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.humor.enabled", havingValue = "true", matchIfMissing = true)
    public HumorClient humorClient(HumorProperties properties) {
        return new HumorClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.ffxivcollect.enabled", havingValue = "true", matchIfMissing = true)
    public FfxivCollectClient ffxivcollectClient(FfxivCollectProperties properties) {
        return new FfxivCollectClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.chucknorrisdatabase.enabled", havingValue = "true", matchIfMissing = true)
    public ChuckNorrisDatabaseClient chucknorrisdatabaseClient(ChuckNorrisDatabaseProperties properties) {
        return new ChuckNorrisDatabaseClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.dungeonsanddragonsalternate.enabled", havingValue = "true", matchIfMissing = true)
    public DungeonsAndDragonsAlternateClient dungeonsanddragonsalternateClient(DungeonsAndDragonsAlternateProperties properties) {
        return new DungeonsAndDragonsAlternateClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.modio.enabled", havingValue = "true", matchIfMissing = true)
    public ModIoClient modioClient(ModIoProperties properties) {
        return new ModIoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.pokapigraphql.enabled", havingValue = "true", matchIfMissing = true)
    public PokApiGraphqlClient pokapigraphqlClient(PokApiGraphqlProperties properties) {
        return new PokApiGraphqlClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.digimoninformation.enabled", havingValue = "true", matchIfMissing = true)
    public DigimonInformationClient digimoninformationClient(DigimonInformationProperties properties) {
        return new DigimonInformationClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.puyonexus.enabled", havingValue = "true", matchIfMissing = true)
    public PuyoNexusClient puyonexusClient(PuyoNexusProperties properties) {
        return new PuyoNexusClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.giantbomb.enabled", havingValue = "true", matchIfMissing = true)
    public GiantBombClient giantbombClient(GiantBombProperties properties) {
        return new GiantBombClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.pathofexile.enabled", havingValue = "true", matchIfMissing = true)
    public PathOfExileClient pathofexileClient(PathOfExileProperties properties) {
        return new PathOfExileClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.sakuracardcaptor.enabled", havingValue = "true", matchIfMissing = true)
    public SakuraCardcaptorClient sakuracardcaptorClient(SakuraCardcaptorProperties properties) {
        return new SakuraCardcaptorClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.playerdb.enabled", havingValue = "true", matchIfMissing = true)
    public PlayerdbClient playerdbClient(PlayerdbProperties properties) {
        return new PlayerdbClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.guildwars2.enabled", havingValue = "true", matchIfMissing = true)
    public GuildWars2Client guildwars2Client(GuildWars2Properties properties) {
        return new GuildWars2Client(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.minecraftserverstatus.enabled", havingValue = "true", matchIfMissing = true)
    public MinecraftServerStatusClient minecraftserverstatusClient(MinecraftServerStatusProperties properties) {
        return new MinecraftServerStatusClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.lichess.enabled", havingValue = "true", matchIfMissing = true)
    public LichessClient lichessClient(LichessProperties properties) {
        return new LichessClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.rawgio.enabled", havingValue = "true", matchIfMissing = true)
    public RawgIoClient rawgioClient(RawgIoProperties properties) {
        return new RawgIoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.halo.enabled", havingValue = "true", matchIfMissing = true)
    public HaloClient haloClient(HaloProperties properties) {
        return new HaloClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.raider.enabled", havingValue = "true", matchIfMissing = true)
    public RaiderClient raiderClient(RaiderProperties properties) {
        return new RaiderClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.eveonline.enabled", havingValue = "true", matchIfMissing = true)
    public EveOnlineClient eveonlineClient(EveOnlineProperties properties) {
        return new EveOnlineClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.funfacts.enabled", havingValue = "true", matchIfMissing = true)
    public FunFactsClient funfactsClient(FunFactsProperties properties) {
        return new FunFactsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.monsterhunterworld.enabled", havingValue = "true", matchIfMissing = true)
    public MonsterHunterWorldClient monsterhunterworldClient(MonsterHunterWorldProperties properties) {
        return new MonsterHunterWorldClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.steam.enabled", havingValue = "true", matchIfMissing = true)
    public SteamClient steamClient(SteamProperties properties) {
        return new SteamClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.jokeapi.enabled", havingValue = "true", matchIfMissing = true)
    public JokeapiClient jokeapiClient(JokeapiProperties properties) {
        return new JokeapiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.psychonauts.enabled", havingValue = "true", matchIfMissing = true)
    public PsychonautsClient psychonautsClient(PsychonautsProperties properties) {
        return new PsychonautsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.whenisnextmcufilm.enabled", havingValue = "true", matchIfMissing = true)
    public WhenIsNextMcuFilmClient whenisnextmcufilmClient(WhenIsNextMcuFilmProperties properties) {
        return new WhenIsNextMcuFilmClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.pokapi.enabled", havingValue = "true", matchIfMissing = true)
    public PokApiClient pokapiClient(PokApiProperties properties) {
        return new PokApiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.scryfall.enabled", havingValue = "true", matchIfMissing = true)
    public ScryfallClient scryfallClient(ScryfallProperties properties) {
        return new ScryfallClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.mariokarttour.enabled", havingValue = "true", matchIfMissing = true)
    public MarioKartTourClient mariokarttourClient(MarioKartTourProperties properties) {
        return new MarioKartTourClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.mmogames.enabled", havingValue = "true", matchIfMissing = true)
    public MmoGamesClient mmogamesClient(MmoGamesProperties properties) {
        return new MmoGamesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.steam2.enabled", havingValue = "true", matchIfMissing = true)
    public Steam2Client steam2Client(Steam2Properties properties) {
        return new Steam2Client(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.deckofcards.enabled", havingValue = "true", matchIfMissing = true)
    public DeckOfCardsClient deckofcardsClient(DeckOfCardsProperties properties) {
        return new DeckOfCardsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.runescape.enabled", havingValue = "true", matchIfMissing = true)
    public RunescapeClient runescapeClient(RunescapeProperties properties) {
        return new RunescapeClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.finalfantasyxiv.enabled", havingValue = "true", matchIfMissing = true)
    public FinalFantasyXivClient finalfantasyxivClient(FinalFantasyXivProperties properties) {
        return new FinalFantasyXivClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.jokesone.enabled", havingValue = "true", matchIfMissing = true)
    public JokesOneClient jokesoneClient(JokesOneProperties properties) {
        return new JokesOneClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.battlenet.enabled", havingValue = "true", matchIfMissing = true)
    public BattleNetClient battlenetClient(BattleNetProperties properties) {
        return new BattleNetClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.valorantnonofficial.enabled", havingValue = "true", matchIfMissing = true)
    public ValorantNonOfficialClient valorantnonofficialClient(ValorantNonOfficialProperties properties) {
        return new ValorantNonOfficialClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.rps101.enabled", havingValue = "true", matchIfMissing = true)
    public Rps101Client rps101Client(Rps101Properties properties) {
        return new Rps101Client(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.rickandmorty.enabled", havingValue = "true", matchIfMissing = true)
    public RickAndMortyClient rickandmortyClient(RickAndMortyProperties properties) {
        return new RickAndMortyClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.quizapiio.enabled", havingValue = "true", matchIfMissing = true)
    public QuizapiIoClient quizapiioClient(QuizapiIoProperties properties) {
        return new QuizapiIoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.tetrio.enabled", havingValue = "true", matchIfMissing = true)
    public TetrIoClient tetrioClient(TetrIoProperties properties) {
        return new TetrIoClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.opentrivia.enabled", havingValue = "true", matchIfMissing = true)
    public OpenTriviaClient opentriviaClient(OpenTriviaProperties properties) {
        return new OpenTriviaClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.marvel.enabled", havingValue = "true", matchIfMissing = true)
    public MarvelClient marvelClient(MarvelProperties properties) {
        return new MarvelClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.hytale.enabled", havingValue = "true", matchIfMissing = true)
    public HytaleClient hytaleClient(HytaleProperties properties) {
        return new HytaleClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.pubg.enabled", havingValue = "true", matchIfMissing = true)
    public PubgClient pubgClient(PubgProperties properties) {
        return new PubgClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.dungeonsanddragons.enabled", havingValue = "true", matchIfMissing = true)
    public DungeonsAndDragonsClient dungeonsanddragonsClient(DungeonsAndDragonsProperties properties) {
        return new DungeonsAndDragonsClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.tronalddump.enabled", havingValue = "true", matchIfMissing = true)
    public TronaldDumpClient tronalddumpClient(TronaldDumpProperties properties) {
        return new TronaldDumpClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.riotgames.enabled", havingValue = "true", matchIfMissing = true)
    public RiotGamesClient riotgamesClient(RiotGamesProperties properties) {
        return new RiotGamesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.magicthegathering.enabled", havingValue = "true", matchIfMissing = true)
    public MagicTheGatheringClient magicthegatheringClient(MagicTheGatheringProperties properties) {
        return new MagicTheGatheringClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.tebex.enabled", havingValue = "true", matchIfMissing = true)
    public TebexClient tebexClient(TebexProperties properties) {
        return new TebexClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.crossuniverse.enabled", havingValue = "true", matchIfMissing = true)
    public CrossUniverseClient crossuniverseClient(CrossUniverseProperties properties) {
        return new CrossUniverseClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.tcgdex.enabled", havingValue = "true", matchIfMissing = true)
    public TcgdexClient tcgdexClient(TcgdexProperties properties) {
        return new TcgdexClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.pokmontcg.enabled", havingValue = "true", matchIfMissing = true)
    public PokMonTcgClient pokmontcgClient(PokMonTcgProperties properties) {
        return new PokMonTcgClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.superheroes.enabled", havingValue = "true", matchIfMissing = true)
    public SuperheroesClient superheroesClient(SuperheroesProperties properties) {
        return new SuperheroesClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.cheapshark.enabled", havingValue = "true", matchIfMissing = true)
    public CheapsharkClient cheapsharkClient(CheapsharkProperties properties) {
        return new CheapsharkClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.xkcd.enabled", havingValue = "true", matchIfMissing = true)
    public XkcdClient xkcdClient(XkcdProperties properties) {
        return new XkcdClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.pandascore.enabled", havingValue = "true", matchIfMissing = true)
    public PandascoreClient pandascoreClient(PandascoreProperties properties) {
        return new PandascoreClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.spacetradersapi.enabled", havingValue = "true", matchIfMissing = true)
    public SpacetradersapiClient spacetradersapiClient(SpacetradersapiProperties properties) {
        return new SpacetradersapiClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.warfacenonofficial.enabled", havingValue = "true", matchIfMissing = true)
    public WarfaceNonOfficialClient warfacenonofficialClient(WarfaceNonOfficialProperties properties) {
        return new WarfaceNonOfficialClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.yugioh.enabled", havingValue = "true", matchIfMissing = true)
    public YuGiOhClient yugiohClient(YuGiOhProperties properties) {
        return new YuGiOhClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.wargamingnet.enabled", havingValue = "true", matchIfMissing = true)
    public WargamingNetClient wargamingnetClient(WargamingNetProperties properties) {
        return new WargamingNetClient(properties.getUrl());
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "miniapis.gamescomics.universalis.enabled", havingValue = "true", matchIfMissing = true)
    public UniversalisClient universalisClient(UniversalisProperties properties) {
        return new UniversalisClient(properties.getUrl());
    }

}
